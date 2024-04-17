package org.ziyu.maker.generator;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import freemarker.template.TemplateException;
import org.ziyu.maker.generator.file.DynamicFileGenerator;
import org.ziyu.maker.generator.main.GenerateTemplate;
import org.ziyu.maker.meta.Meta;
import org.ziyu.maker.meta.MetaManager;

import java.io.File;
import java.io.IOException;


public class MainGenerator extends GenerateTemplate {

    @Override
    protected void buildDist(String outputPath, String jarPath, String shellOutputFilePath, String sourceCopyDestPath) {

        System.out.println("不要给我输出 dist 啦！");
    }


}
