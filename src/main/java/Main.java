public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Кирилл";
        post.passport = "1234 №123456";
        post.patronymic = "Дмитриевич";
        post.phone = "+7(901)987-65-43";
        post.surname = "Костиков";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 03;
        post.birthday.month = 11;
        post.birthday.year = 1990;
    }
}

