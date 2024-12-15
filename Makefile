JAVAC = javac
JAVA = java
SRC = Login.java StudyMate.java  
CLASS = Login  

all: compile run

compile:
	$(JAVAC) $(SRC)  

run:
	$(JAVA) $(CLASS)  

clean:
	rm -f *.class  
