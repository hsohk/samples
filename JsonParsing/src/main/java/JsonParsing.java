import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonParsing {
    public static class User{
        public enum Gender { MALE, FEMALE };
        public static class Name {
            private String first, last;

            public String getFirst() {
                return first;
            }

            public void setFirst(String first) {
                this.first = first;
            }

            public String getLast() {
                return last;
            }

            public void setLast(String last) {
                this.last = last;
            }
        }
        private Name name;
        private Gender gender;
        private boolean isVerified;

        public Name getName() {
            return name;
        }

        public void setName(Name name) {
            this.name = name;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public boolean isVerified() {
            return isVerified;
        }

        public void setVerified(boolean verified) {
            isVerified = verified;
        }

    }

    public static void main(String[] args) throws JsonProcessingException {
        String jsondata = "{\"name\": {\"first\" :\"joe\", \"last\" : \"Sixpack\"}," +
                "\"gender\" : \"MALE\"," +
                "\"verified\" : false" +
                "}";
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(jsondata, User.class);
        System.out.println(user.toString());


    }
}
