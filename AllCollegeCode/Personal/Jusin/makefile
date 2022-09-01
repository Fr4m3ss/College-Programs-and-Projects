#TextBasedGamePart4 makefile

TextBasedGamePart4: TextBasedGamePart4.o
	g++ TextBasedGamePart4.o -o TextBasedGamePart4

TextBasedGamePart4.o: TextBasedGamePart4.cpp User.h User.cpp Room.h Room.cpp
		g++ -c TextBasedGamePart4.cpp
		g++ -c User.h
		g++ -c User.cpp
		g++ -c Room.h
		g++ -c Room.cpp

clean: rm -rf *o TextBasedGamePart4
