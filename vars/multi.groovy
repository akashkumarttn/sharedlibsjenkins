def multi(Object... args) {
    no.of_args = length(args)
    string = "${path} ${args[0]} ${args[1]} ${args[3]} ${args[4] n"
    for value in range[0,no.of_args]:
        string += agrs[value]
    sh "string"
    //echo "{ ${path} ${args[0]} ${args[1]} ${args[3]} ${args[4]}}"
   // sh "python3 scripts/cur_scripts/tag-tables-update-new.py ${args[0]} ${month} ${level} '${accounts}'"
}
