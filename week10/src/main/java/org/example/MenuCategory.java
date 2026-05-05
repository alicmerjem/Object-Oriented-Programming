package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MenuCategory {
    String name();
    boolean available() default true;
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface OrderAction {
    String handledBy();
    int estimatedMinutes() default 5;
    boolean requiresPayment() default false;
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldValidation {
    int maxLength() default 50;
    boolean nullable() default false;
}

@MenuCategory(name = "Pizza", available = true)
class PizzaOrder {
    @FieldValidation(maxLength = 30, nullable = false)
    private String customerName;

    @FieldValidation(maxLength = 100, nullable = true)
    private String specialRequest;

    @FieldValidation(maxLength = 20, nullable = false)
    private String itemName;

    @OrderAction(handledBy = "Cashier", estimatedMinutes = 2, requiresPayment = false)
    void takeOrder() {
        System.out.println("Taking order...");
    }

    @OrderAction(handledBy = "Chef", estimatedMinutes = 15)
    void prepareFood() {
        System.out.println("Preparing pizza...");
    }

    @OrderAction(handledBy = "Cashier", requiresPayment = true)
    void processPayment() {
        System.out.println("Processing payment...");
    }
}

class PizzaTestingAnnotated {
    public static void main(String[] args) {
        PizzaOrder myOrder = new PizzaOrder();
        Class<?> clazz = myOrder.getClass();

        if (clazz.isAnnotationPresent(MenuCategory.class)) {
            MenuCategory menuCategory = clazz.getAnnotation(MenuCategory.class);
            System.out.println("=== Menu Category ===");
            System.out.println("Category: " + menuCategory.name());
            System.out.println("Available: " + (menuCategory.available() ? "Yes" : "No"));
        }

        System.out.println("=== Field Validation ===");
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(FieldValidation.class)) {
                FieldValidation fv = field.getAnnotation(FieldValidation.class);
                System.out.println("Field: " + field.getName());
                System.out.println("Max len: " + fv.maxLength());
                System.out.println("NUllable: " + (fv.nullable() ? "Yes" : "No"));
                System.out.println("------------------------");
            }
        }

        System.out.println("=== Order Action ===");
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(OrderAction.class)) {
                OrderAction orderAction = method.getAnnotation(OrderAction.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Handled by: " + orderAction.handledBy());
                System.out.println("Est. time: " + orderAction.estimatedMinutes());
                System.out.println("Requires payment: " + (orderAction.requiresPayment() ? "Yes" : "No"));
            }
        }
    }
}
