filename = Program1_CountFlips
filename = Program2_PrintVowelsAndNonVowels
filename = Program3_TheTwelveDaysOfChristmas
filename = Program4_OneHundredBottlesOfBeer

all: compile run

compile:
	javac $(filename).java
run:
	java $(filename)
clean:
	rm *.class
