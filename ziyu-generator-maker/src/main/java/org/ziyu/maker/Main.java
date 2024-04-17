package org.ziyu.maker;

//import org.ziyu.maker.cli.CommandExecutor;

import freemarker.template.TemplateException;
import org.ziyu.maker.generator.MainGenerator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.doGenerate();
    }

}