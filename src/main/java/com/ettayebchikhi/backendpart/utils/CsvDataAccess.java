package com.ettayebchikhi.backendpart.utils;

import com.ettayebchikhi.backendpart.models.AppUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
@Slf4j
@Service
public class CsvDataAccess implements DataAccess{
    final  String fileName = "data.csv";
    final String[] randomNames = {
            "John Doe",
            "Jane Smith",
            "Bob Johnson",
            "Alice Williams",
            "Charlie Brown",
            "Emma Davis",
            "Michael Lee",
            "Olivia Wilson",
            "Daniel White",
            "Sophia Miller"
    };
    final String[] randomEmails = {
            "john.doe@example.com",
            "jane.smith@example.com",
            "bob.johnson@example.com",
            "alice.williams@example.com",
            "charlie.brown@example.com",
            "emma.davis@example.com",
            "michael.lee@example.com",
            "olivia.wilson@example.com",
            "daniel.white@example.com",
            "sophia.miller@example.com"

    };
    @Override
    public List<AppUser> getRecords() {
        List<AppUser> users = new ArrayList<>();
        try  {
            // to skip header
            Scanner scanner = new Scanner(new File(fileName));
            scanner.nextLine();
            log.warn("in get records ");
            while (scanner.hasNextLine() ) {
                String record = scanner.nextLine();
                log.warn("record : {} ", record);
                String[] elements = record.split(",");
                users.add(
                        AppUser.builder()
                                .id(Long.parseLong(elements[0]))
                                .name(elements[1])
                                .age(Integer.parseInt(elements[2]))
                                .email(elements[3])
                                .build()
                );
            }
            return users;
        }catch (Exception e){
            throw new RuntimeException("error while reading file ");
        }
    }

    // return a random object
    public AppUser getRandomRecord(){
        Random random = new Random();

        int randomIndex = random.nextInt(randomNames.length) ;
          return AppUser.builder()
                .name(randomNames[randomIndex])
                .email(randomEmails[randomIndex])
                .age(random.nextInt(80)+10) // next int return a number between O and n-1 so i add 10 as offset
                .build();
    }

}
