#!/bin/bash

# Adapted from exercise on pages 517-523 of Mark Sobell's "A Practical Guide to Linux", 4th edition


# Uncomment the line below if you want debugging output
# set -o xtrace


# *********** I N I T I A L I Z A T I O N ***********
function init()
{
    trap 'summary ; exit 0' INT               # Handle ctrl-c
    question_count=0
    question_correct=0
    cd ${QUIZDIR:=~/quizzes/} || exit 1
}
# *********** --------------------------- ***********




# *********** Q U I Z _ S E L E C T ***********
function quiz_select()
{
    subjects=$(ls)                          # It's probably not necessary to create a third shell, as the text does with ($(ls))
    PS3="Choose a quiz: "
    select quiz in $subjects
    do
	if [[ -z "$quiz" ]]                 # No choice was made?
	then
	    echo "No quiz was chosen." >&2  # Send this both stdout and stderr
	    exit 2
	else
	    echo "$quiz"
	    return
	fi
    done
    echo 
    return
}
# *********** --------------------- ***********




# *********** S H U F F L E ***********
function shuffle()
{
    order=$(ls . | shuf)
}
# *********** ------------- ***********




# *********** A S K ***********
function ask()
{
    question=$(head -1 $1)
    correct_answer=$(head -2 $1 | tail -1)
    mapfile -t -s 2 possible_answers < $1 		# mapfile is a simpler way than using an explicit loop
    mapfile -t shuf_ans < <(shuf -e "${possible_answers[@]}") 

    echo
    echo $question
    
    select ans in "${shuf_ans[@]}"
    do
	if [[ -z "$ans" ]]
	then
	    echo Not a valid choice. Try again.
	elif [[ "$ans" = "$correct_answer" ]]
	then
	    echo Correct.
	    return 1
	else
	    echo No, the answer was "'$correct_answer'"
	    return 0
	fi
    done
}
# *********** ----- ***********




# *********** S U M M A R Y ***********
function summary()
{
	echo	
	if (( question_count == 0 ))
	then
	    echo You did not answer any questions.
	    exit 0
	fi

(( percent =  100 * question_correct / question_count ))
echo You answered $question_correct questions correctly, out of $question_count total questions '('${percent}%')'.
}
# *********** ------------- ***********




# # # # #  MAIN  # # # # #

init

quiz=$(quiz_select)
[[ $? -eq 0 ]] || exit 1
test -z $quiz && echo "No quiz selected" && exit 1

cd $quiz || exit 1
shuffle

for question in $order
do
	ask $question
	result=$?

	((question_count++))
	if [[ $result == 1 ]]
	then
		((question_correct++))
	fi
	echo
	sleep ${QUIZDELAY:=1}
done

summary

exit 0
