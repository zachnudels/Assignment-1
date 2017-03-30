JAVAC=/usr/bin/javac
.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $<

classes: Record.class SearchItLinear.class BinaryTreeNode.class PrintIt.class BinarySearchTree.class SearchIt.class
default: $(CLASSES)

clean:
	rm *.class
