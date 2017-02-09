#!/bin/bash

echo launch dist
ant dist
echo copie en cours...
cd dist

cp -i utils.jar ../../swapHome/lib/utils.jar
