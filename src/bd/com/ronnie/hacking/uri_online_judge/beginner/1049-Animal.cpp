#include<iostream>
#include<cstdio>
#include<string>

using namespace std;

int main() {
    string level1, level2, level3, result = "";
    cin >> level1 >> level2 >> level3;

    if(!level1.compare("vertebrado")) {
        if(!level2.compare("ave")) {
            if(!level3.compare("carnivoro")) {
                result = "aguia";
            }
            else if(!level3.compare("onivoro")) {
                result = "pomba";
            }
        }
        else if(!level2.compare("mamifero")) {
            if(!level3.compare("onivoro")) {
                result = "homem";
            }
            else if(!level3.compare("herbivoro")) {
                result = "vaca";
            }
        }
    }

    else if(!level1.compare("invertebrado")) {
        if(!level2.compare("inseto")) {
            if(!level3.compare("hematofago")) {
                result = "pulga";
            }
            else if(!level3.compare("herbivoro")) {
                result = "lagarta";
            }
        }
        else if(!level2.compare("anelideo")) {
            if(!level3.compare("hematofago")) {
                result = "sanguessuga";
            }
            else if(!level3.compare("onivoro")) {
                result = "minhoca";
            }
        }
    }

    cout << result << endl;

    return 0;
}

