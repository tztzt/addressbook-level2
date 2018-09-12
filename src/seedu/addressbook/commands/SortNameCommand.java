package seedu.addressbook.commands;

import seedu.addressbook.data.person.Person;

import java.util.Comparator;

public class SortNameCommand extends Command{

    public static final String COMMAND_WORD = "sortname";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Sorts all data of persons in address book "
            + "in alphabetical order according to their name.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SORT_ACKNOWEDGEMENT = "Sorting Address Book as requested ...";

    @Override
    public CommandResult execute() {
        return new CommandResult(MESSAGE_SORT_ACKNOWEDGEMENT);
    }

    class MyComparator implements Comparator<Person> {

        public int compare(Person s1, Person s2){
            return s1.getName().fullName.compareTo(s2.getName().fullName);
        }
    }

}
