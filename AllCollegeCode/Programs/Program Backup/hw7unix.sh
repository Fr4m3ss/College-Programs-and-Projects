#!/bin/sh

#Francesco Messina, fam19b, 4 December 2019


#greets user by name

	echo "Howdy" $1 "!"
	
#compiles hw7unix.cpp

	g++ -o points.exe hw7unix.cpp

#executes and puts output into myOutput.txt

	points.exe > myOutput.txt

#prints date and time

	echo "The date is"
	
	date
	
#word count 

	wc -w myOutput.txt

#compares sample.out and myOutput.txt

	diff -w sample.out myOutput.txt

#makes a directory based on user input

	mkdir $2

#moves the specified file types to the specified directory

	mv *$3 $2  

#creates a tar file with the files the user specifies

	tar -cvf newtar.tar  $2 

	exit
