#!/bin/bash

function cmd()
{
    test $(find $1 -xdev -type f 2> /dev/null | wc -l) -eq 0 && echo 0 && return
    ret=$(find $1 -xdev 2> /dev/null  | xargs file | egrep 'dynamically linked' | wc -l)
    echo $ret
}

least_dir=$1
least_count=$(cmd $1)
shift
for dir in $@
do
    count=$(cmd $dir)
    test $count -lt $least_count && least_count=$count && least_dir=$dir
done

echo Directory $least_dir has the least dynamically linked files with $least_count
