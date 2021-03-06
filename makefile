##Makefile to compile
##Zach Nudelman
##29 March 2017

LIB = ../lib
SRCDIR = src
BINDIR = bin
TESTDIR = test
DOCDIR = doc
CLI = $(LIB)/cli/commons-cli-1.3.1.jar
ASM = $(LIB)/asm/asm-5.0.4.jar:$(LIB)/asm/asm-commons-5.0.4.jar:$(LIB)/asm/asm-tree-5.0.4.jar
JUNIT = $(LIB)/junit/junit-4.12.jar:$(LIB)/junit/hamcrest-core-1.3.jar
JACOCO = $(LIB)/jacoco/org.jacoco.core-0.7.5.201505241946.jar:$(LIB)/jacoco/org.jacoco.report-0.7.5.201505241946.jar:
TOOLS = $(LIB)/tools
JAVAC = /usr/bin/javac
JFLAGS = -g -d $(BINDIR) $(SRCDIR)/*.java -cp $(BINDIR):$(JUNIT)

vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

# define general build rule for java sources
.SUFFIXES:  .java  .class

.java.class:
	$(JAVAC)  $(JFLAGS)  $<

#default rule - will be invoked by make
all: Record.class \
				BinaryTreeNode.class \
				BinarySearchTree.class \
				PrintIt.class \
				SearchIt.class \
				SearchItLinear.class \
				Querygen.class \
				SearchItTest.class \
				SearchItLinearTest.class \

# Rule for generating documentation
jdoc:
	javadoc -d $(DOCDIR) $(SRCDIR)/*.java

test_classes:	all TestRecord.class TestBinaryTreeNode.class TestBinarySearchTree.class TestQueryGen.class TestSuite.class

#Rule for unit tests
test:
	java -ea -cp $(BINDIR):$(JUNIT) org.junit.runner.JUnitCore TestSuite

# Rules for generating tests
jacoco.exec: test_classes
	java -ea -javaagent:$(LIB)/jacoco/jacocoagent.jar -cp $(BINDIR):$(JUNIT) org.junit.runner.JUnitCore TestSuite

report: jacoco.exec
	java -cp $(BINDIR):$(CLI):$(JACOCO):$(ASM):$(TOOLS) Report --reporttype html .

#Rules for executing applications
SearchIt:
	java -cp ./bin SearchIt

PrintIt:
	java -cp ./bin PrintIt

SearchItLinear:
	java -cp ./bin SearchItLinear

Querygen:
	java -cp ./bin Querygen

SearchItTest:
	java -cp ./bin SearchItTest ${ARGS}

SearchItLinearTest:
	java -cp ./bin SearchItLinearTest ${ARGS}

QuerygenMain:
	java -cp ./bin QuerygenMain

#Cleans folders
clean:
	@rm -f  $(BINDIR)/*.class
	@rm -f jacoco.exec *.xml *.csv
	@rm -Rf coveragereport
	@rm -Rf doc
