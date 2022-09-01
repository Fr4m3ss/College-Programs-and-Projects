#!/bin/bash

while read url; do
echo Doing $url with command : wget -H -q -P work-dir -e robots=off -p -r -l 1 --keep-session-cookies --save-cookies ${url}.cookies https://$url
mkdir -v work-dir
time wget -H -q -P work-dir -e robots=off -p -r -l 1 --keep-session-cookies --save-cookies ${url}.cookies https://$url
rm -r work-dir
done < hosts
