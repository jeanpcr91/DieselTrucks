package dto;

public class Teacher extends Person{

    public Teacher(){

    }

    public Teacher (String name, String lastName, int age, String[] topics){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.topics = topics;
    }

    public String getString(){
        return ("Name: "+ name+" , LastName: "+lastName+ " , Age: "+ age
                + " , Topics: " + getTopicsString());
    }


    public String[] getTopics() {
        return topics;
    }

    public String getTopicsString() {
        String topicsString = "";

        for (int i = 0; i < topics.length; i++) {
            topicsString += (i == topics.length-1) ? topics[i] + "." : topics[i] + ", ";
        }
        return topicsString;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    String[] topics;
}
