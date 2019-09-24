#!/bin/bash

javac src/Aplication.java

mv src/Aplication.class bin/ && mv src/model/*.class bin/model/ && mv src/services/*.class bin/services/

java bin/Aplication
