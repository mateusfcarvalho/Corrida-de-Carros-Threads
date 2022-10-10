//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javafx.application.Platform;
import javafx.scene.control.Button;

public class RunnableCarro implements Runnable {
    public Button button;
    public String nome;
    public int prioridade = 1;

    public RunnableCarro(Button v1, String v2) {
        this.button = v1;
        this.nome = v2;
    }

    public void run() {
        Thread.currentThread().setPriority(this.prioridade);
        System.out.println(Thread.currentThread().getName() + " - Prioridade: " + Thread.currentThread().getPriority());

        for(int i = 1; i <= 600; ++i) {
            Platform.runLater(() -> {
                this.button.setLayoutX(this.button.getLayoutX() + 1.0);
            });
            if (this.button.getLayoutX() == 350.0) {
                System.out.println(Thread.currentThread().getName() + " - Chegou!!!");
            }

            this.sleep2();
        }

    }

    public void sleep1() {
        try {
            Thread.sleep(50L);
        } catch (InterruptedException var2) {
        }

    }

    public void sleep2() {
        int l = 0;

        for(int j = 1; j <= 4000000; ++j) {
            if (l % 3 == 0) {
                l += 2;
            }

            if (l % 2 == 0) {
                ++l;
            }

            ++l;
        }

    }
}

