#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
void powerOn();
void powerOff();
char **scanDev();
bool pairDev(char *devName);
void connect(char *devName);
void removeDevice(char *devName);
void showParied();
void message(char *msg);

int main()
{
    powerOn();
    char **deviceAvailable = scanDev();
    pairDev(deviceAvailable[0]);
    powerOff();
    return 0;
}

void message(char *msg){
    printf("%s\n", msg);
}

void powerOn(){
    message("bluetooth : power on ...");
    // system("bluetoothctl power on");
}

void powerOff(){
    message("bluetooth : power off ...");
    // system("bluetoothctl power on");
}

char **scanDev(){
    message("scanning device ...");

    char **deviceAvailable = (char**) malloc(30* sizeof(char*));
    for (int i = 0; i < 30; i++)
    {
        deviceAvailable[i] = (char*) malloc(40*sizeof(char));
    }
    
    sprintf(deviceAvailable[0], "qw:we:qw:we"); 

    return deviceAvailable;
}


bool pairDev(char *devName){
    // if duccess true
    message("Pair with");
    message(devName);

    return true;
}

void connect(char *devName){
    message("connect with ");
    message(devName);
}

void removeDevice(char *devName){
    message("Remove  ");
    message(devName);
}