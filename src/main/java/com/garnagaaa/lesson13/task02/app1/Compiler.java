package com.garnagaaa.lesson13.task02.app1;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * Класс компилятора
 */
public class Compiler {

    /**
     * Метод запуска компиляции
     *
     * @param file имя файла
     * @return Статус компиляции
     */
    public static boolean Compile(String file){
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        return compiler.run(null, null, null, file) == 0;
    }
}
