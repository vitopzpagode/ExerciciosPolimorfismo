
package exercicio12;


public class Exercicio12 {

    public static void main(String[] args) {
        Notificacao email = new Email();
        Notificacao sms = new SMS();
        Notificacao push = new Push();
        Notificacao whatsapp = new WhatsApp();
        Notificacao telegram = new Telegram();

        email.enviar();
        sms.enviar();
        push.enviar();
        whatsapp.enviar();
        telegram.enviar();

    }
}
