SRC = $(wildcard *.java)
CLASS = $(SRC:.java=.class)
ALL: $(CLASS)

.PHONY: clean

ALL: MM1.class SimTest.class

%.class: %.java
	javac $<

clean:
	\rm -f *.class *~ *.csv
	cd jdes && \rm -f *.class *~
