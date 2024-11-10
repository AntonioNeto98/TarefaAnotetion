package Anotacao;

import java.lang.reflect.Field;

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> clazz = NomeTabela.class;
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                if (field.isAnnotationPresent(Tabela.class)) {
                    Tabela tabela = field.getAnnotation(Tabela.class);
                    System.out.println("Campo: " + field.getName() + ", Tabela: " + tabela.value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

