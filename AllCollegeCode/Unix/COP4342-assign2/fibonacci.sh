#!/bin/bash

if [[ $# != 1 ]]
then
   echo "Please provide exactly one argument"
   exit 1
fi

if [[ $1 =~ ^[0-9]+$ ]]
then
   echo "computing fibonacci($1)"
else
   echo Argument $1 does not appear to be a positive number
   exit 1
fi

product=0
productold=1

echo "fibonacci(0) = 0"
for((i=1 ; i<=$1 ; i++))
do
   (( product = $productold + $product))
   (( productold = $product - $productold))
   echo "fibonacci($i) = $product"
done

