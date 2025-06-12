#!/bin/bash

# clear the screen
clear

# compilation
echo "Compilation ..."
javac myApp/*java

# run
echo "running ..."
java myApp.Main

rm myApp/*.class