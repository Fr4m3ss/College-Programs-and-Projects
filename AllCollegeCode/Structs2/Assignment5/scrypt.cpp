#include <iostream>
#include <utility>
#include <unistd.h>
#include <crypt.h>
#include <string>
#include <cstring>

using namespace std;

int main()
{
  pair <string, string> p;
  char salt[] = "$1$########";
  string key = "Rumpelstilskin";

  char * password = new char [100];
  strcpy ( password, crypt(key.c_str(), salt));
  cout << "Plaintext = " << key << endl;
  cout << "Encrypted = " << password << endl;
  delete [] password;
  return 0;
}
