#!/bin/bash

if [[ $# != 1 ]]
then
   echo "Please provide exactly one argument"
   exit 1
fi

if [[ $1 =~ ^[0-9]+$ ]]
then
   echo "computing factorial($1)"
else
   echo Argument $1 does not appear to be a positive number
   exit 1
fi

product=1

echo "factorial(1) = 1"
for((i=2 ; i<=$1 ; i++))
do
   ((product = $product * $i))
   echo "factorial($i) = $product"
done

