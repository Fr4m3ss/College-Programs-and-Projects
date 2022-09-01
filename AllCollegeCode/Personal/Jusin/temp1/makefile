#TextBasedGamePart7 makefile

TextBasedGamePart7: TextBasedGamePart7.o
	g++ -std=c++11 TextBasedGamePart7.o  -o TextBasedGame

TextBasedGamePart7.o: TextBasedGamePart7.cpp User.h User.cpp Room.h Room.cpp BadGuy.h BadGuy.cpp SuperUser.h SuperUser.cpp
			g++ -std=c++11 -c TextBasedGamePart7.cpp
			g++ -std=c++11 -c User.h
			g++ -std=c++11 -c User.cpp
			g++ -std=c++11 -c Room.h
			g++ -std=c++11 -c Room.cpp
			g++ -std=c++11 -c BadGuy.h
			g++ -std=c++11 -c BadGuy.cpp
			g++ -std=c++11 -c SuperUser.h
			g++ -std=c++11 -c SuperUser.cpp

clean: rm -rf *o TextBasedGame


