#!/bin/bash

function usage()
{
    echo ' '
    echo '  **********'
    echo '  * '
    echo '  *   cop4342-assign5.sh [-@ DNS_SERVER] [-s TIMEOUT] [-q] [-t] [-y] [-a] [-6] [-m] [-r] [-v] HOST ... '
    echo '  * '
    echo '  *      This assignment augments standard "dig" so that it can handle multiple DNS record type requests'
    echo '  *      for multiple DNS names (i.e., it does the cartesian production of dig against DNS records versus'
    echo '  *      DNS names.)'
    echo '  * '
    echo '  *      It accepts these options:'
    echo '  * '
    echo '  *       -@ DNS_SERVER'
    echo '  *             Query this specific DNS_SERVER (8.8.8.8, 8.8.4.4, and 1.1.1.1 are all reasonable choices.)'
    echo '  * '
    echo '  *       -s TIMEOUT'
    echo '  *             Wait up to TIMEOUT seconds for a response.'
    echo '  * '
    echo '  *       -q'
    echo '  *             Use terse mode.'
    echo '  * '
    echo '  *       -y'
    echo '  *             Use tcp instead of udp; very valuable here at FSU since our udp queries are very slow since'
    echo '  *             due to the heavy-handed censorship imposed last year.'
    echo '  * '
    echo '  *       -t'
    echo '  *             Return a TXT record.'
    echo '  * '
    echo '  *       -a'
    echo '  *             Return an A record.'
    echo '  * '
    echo '  *       -6'
    echo '  *             Return an AAAA record.'
    echo '  * '
    echo '  *       -m'
    echo '  *             Return an MX record.'
    echo '  * '
    echo '  *       -r'
    echo '  *             Return an SPF record.'
    echo '  * '
    echo '  *       -v'
    echo '  *             Return an SRV record.'
    echo '  * '
    echo '  **********'
    exit 1
}

option_construction=""
cmd_construction=""
while getopts "@:s:qtya6mrv" opt 
do
   case $opt in
       # ======================================
       # YOUR WORK STARTS FROM HERE
	@)
	option_construction+="@$OPTARG "
	;;

	s)
	option_construction+="+timeout=$OPTARG "
	;;

	q)
	option_construction+="+short "
	;;

	y)
	option_construction+="+tcp "
	;;

	t)
	cmd_construction+="TXT "
	;;

	a)
	cmd_construction+="A "
	;;

	6)
	cmd_construction+="AAAA "
	;;

	m)
	cmd_construction+="MX "
	;;

	r)
	cmd_construction+="SPF "
	;;

	v)
	cmd_construction+="SRV "
	;;



       # YOUR WORK ENDS HERE
       # ======================================
   esac
done

#
# Remove the options from the command line, leaving just the arguments
#
shift $(( $OPTIND - 1 ))

for dnsname in $*
do
    echo "Report for $dnsname"
    for cmd in $cmd_construction
    do
	echo dig $option_construction $dnsname $cmd 
	ans=$(dig $option_construction $dnsname $cmd | sed -e 's/^/   /g')
	if [[ "x" == "x$ans" ]]
	then
	    echo "  " NO ANSWER to $cmd query for $dnsname
	else
#	    echo $dnsname $cmd 
	    echo "$ans" 
	fi
	echo " "
    done
    echo " "
done