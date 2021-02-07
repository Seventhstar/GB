package  com.evgeny_k.java_core_adv_lesson_7.server;

public interface AuthService {
    void start();
    void stop();
    String getNickByLoginAndPass(String login, String password);
}
