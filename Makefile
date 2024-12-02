JAVAC = javac
JAVA = java
SRC = *.java
CLASS = StudyMate

all: compile run

compile:
	$(JAVAC) $(SRC)

run:
	$(JAVA) $(CLASS)

clean:
	rm -f *.class
