public class Main{
    public static void main(String args[]){

        ProfileRepository repository= new ProfileRepository();

        ProfileService service= new ProfileService(repository);

        Profile profile1 = new Profile(
                1,
                "John",
                "01712345678",
                "Dhaka",
                "john@gmail.com"
        );

        Profile profile2 = new Profile(
                2,
                "Sarah",
                "01812345678",
                "Chittagong",
                "sarah@gmail.com"
        );

        service.addProfile(profile1);
        service.addProfile(profile2);

        System.out.println("All profiles:");
        System.out.println(service.getProfiles());

        System.out.println("\nFind profile:");
        System.out.println(service.getProfile(1));

    }
}      