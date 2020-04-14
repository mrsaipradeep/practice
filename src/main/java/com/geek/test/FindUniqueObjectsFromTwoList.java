package com.geek.test;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindUniqueObjectsFromTwoList {
    class Person1 {
        int id;
        String fName;
        String lName;

        public Person1(int id, String fName, String lName) {
            this.id = id;
            this.fName = fName;
            this.lName = lName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getfName() {
            return fName;
        }

        public void setfName(String fName) {
            this.fName = fName;
        }

        public String getlName() {
            return lName;
        }

        public void setlName(String lName) {
            this.lName = lName;
        }
    }

    class Person2 {
        int id;
        String fatherName;
        String motherName;

        public Person2(int id, String motherName, String fatherName) {
            this.id = id;
            this.fatherName = fatherName;
            this.motherName = motherName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFatherName() {
            return fatherName;
        }

        public void setFatherName(String fatherName) {
            this.fatherName = fatherName;
        }

        public String getMotherName() {
            return motherName;
        }

        public void setMotherName(String motherName) {
            this.motherName = motherName;
        }
    }

    class NewPerson {
        int id;
        String fName;
        String lName;
        String fatherName;
        String motherName;

        public NewPerson(int id, String fName, String lName, String fatherName, String motherName) {
            this.id = id;
            this.fName = fName;
            this.lName = lName;
            this.fatherName = fatherName;
            this.motherName = motherName;
        }

        @Override
        public String toString() {
            return "NewPerson{" +
                    "id=" + id +
                    ", fName='" + fName + '\'' +
                    ", lName='" + lName + '\'' +
                    ", fatherName='" + fatherName + '\'' +
                    ", motherName='" + motherName + '\'' +
                    '}';
        }
    }

    private List<Person1> createPerson1List() {
        List<Person1> collect = IntStream.range(1, 100000)
                .mapToObj(value -> new Person1(value, "A" + value, "B" + value))
                .collect(Collectors.toList());
        collect.add(new Person1(10,"A10","B10"));
        return collect;


    }

    private List<Person2> createPerson2List() {
        List<Person2> collect = IntStream.range(1, 95000)
                .mapToObj(value -> new Person2(value, "M" + value, "F" + value))
                .collect(Collectors.toList());
        collect.add(new Person2(10,"M10","F10"));
        return collect;
    }

    private NewPerson createNewPerson(int id, String fName, String lName, String fatherName, String motherName) {
        return new NewPerson(id, fName, lName, fatherName, motherName);
    }

    public static void main(String[] args) {

        FindUniqueObjectsFromTwoList main = new FindUniqueObjectsFromTwoList();
        List<Person1> person1List = main.createPerson1List();

        List<Person2> person2List = main.createPerson2List();
        long begin = System.currentTimeMillis();
        Map<Integer, Person2> person2IdMap = person2List.stream().collect(Collectors.toMap(Person2::getId, Function.identity(),(o, o2) -> o));
        List<NewPerson> newPersonList =
                person1List.stream().
                        map(person1 -> {
                            Person2 person2 = person2IdMap.get(person1.getId());
                            if (person2 != null)
                                return main.createNewPerson(person1.getId(), person1.getfName(), person1.getlName(), person2.getFatherName(), person2.getMotherName());
                            else
                                return null;
                        })
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
        System.out.println(newPersonList.size());
//        System.out.println(newPersonList);
        long end = System.currentTimeMillis();
        System.out.println("Total time taken in ms " + (end - begin));

    }


}

