import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {

    public static void main(String[] args) {
        String name = "";
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            name = in.next();
            in.close();
        }

        Class c = null;
        try {
            c = Class.forName(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (c != null) {
            int m = c.getModifiers();
            String modifier = Modifier.toString(m);
            if (modifier.length() > 0) {
                System.out.print(modifier + " ");
            }
            System.out.println("class " + c.getSimpleName() + " {");

            printFields(c);
            System.out.println();

            printConstructors(c);
            System.out.println();

            printMethods(c);

            System.out.print("}");
        }
    }

    private static void printConstructors(Class cls) {
        Constructor[] ctors = cls.getConstructors();
        for (Constructor c : ctors) {
            System.out.print("    ");

            String modifier = Modifier.toString(c.getModifiers());
            if (modifier.length() > 0) {
                System.out.print(modifier + " ");
            }

            String name = c.getName();
            System.out.print(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                Class pc = paramTypes[i];
                System.out.print(pc.getName());
                if (i < paramTypes.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println(");");
        }
    }

    private static void printFields(Class cls) {
        Field[] fields = cls.getFields();
        for (Field field: fields) {
            System.out.print("    ");

            int m = field.getModifiers();
            String modifier = Modifier.toString(m);
            if (modifier.length() > 0) {
                System.out.print(modifier + " ");
            }
            
            Class type = field.getClass();
            System.out.print(type.getSimpleName() + " ");
            System.out.println(field.getName() + ";");
        }
    }

    private static void printMethods(Class cls) {
        Method[] methods = cls.getMethods();

        for (Method m: methods) {
            System.out.print("    ");

            int mod = m.getModifiers();
            String modifier = Modifier.toString(mod);
            if (modifier.length() > 0) {
                System.out.print(modifier + " ");
            }

            Class resType = m.getReturnType();
            System.out.print(resType.getSimpleName() + " ");

            String name = m.getName();
            System.out.print(name + "(");

            Class[] types = m.getParameterTypes();
            for (int i = 0; i < types.length; i++) {
                Class c = types[i];
                System.out.print(c.getSimpleName());
                if (i < types.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println(");");
        }
    }

}