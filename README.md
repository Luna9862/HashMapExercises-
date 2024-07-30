# HashMapExercises-
Quizzes:
1. Which command retrieves the value 3 from the hash map?

HashMap<String, Integer> conversionMap = new HashMap<>();

conversionMap.put("3", 9);
conversionMap.put("6", 6);
conversionMap.put("9", 3);

if(/* code here */ == 3) {
System.out.println("Correct!");
}
answer: conversionMap.get("9")

2. Which command can be used to retrieve the number 4 from the hash map?

public class Person {
private String name;
private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

-----------------

public static void main(String[] args) {
HashMap<String, Person> personMap = new HashMap<>();

    Person casper = new Person("Casper", 55);
    Person mike = new Person("Mike", 4);
    Person matt = new Person("Matt", 12);

    personMap.put(casper.getNimi(), casper);
    personMap.put(mike.getNimi(), mike);
    personMap.put(matt.getNimi(), matt);

    if(/* code here */ == 4) {
        System.out.println("Correct!");
    }
}
answer: personMap.get("Mike").getAge()
