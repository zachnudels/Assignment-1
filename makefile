JAVAC=/usr/bin/javac
.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $<
	
classes: Record.class SearchItLinear.class
default: $(CLASSES)

clean:
	rm *.class