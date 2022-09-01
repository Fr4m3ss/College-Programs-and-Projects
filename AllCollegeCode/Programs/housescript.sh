#!/bin/sh
if [ -z "$1" ] ; then
	echo usage: "$0" houseinput.txt
	echo '(or:  '"$0"' <<<EOF and then typing it in)'
fi
echo right-side up:
cat "$1"
echo horizontal flip:
rev "$1" | tr '\\/[]' '/\\]['
echo vertical flip:
tac "$1" | tr '\\/_' '/\\-'
echo 180-degree rotation:
rev "$1" | tr "[]_" "][-" | tac
