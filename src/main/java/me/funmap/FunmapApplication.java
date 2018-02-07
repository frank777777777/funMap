package me.funmap;

import me.funmap.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;


@MappedTypes(User.class)
@MapperScan("me.funmap.mapper")
@SpringBootApplication
public class FunmapApplication {


	public FunmapApplication() throws IOException {
	}

	public static void main(String[] args) {
		SpringApplication.run(FunmapApplication.class, args);
	}
}
