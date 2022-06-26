package com.ceva.coding_test1.Services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ceva.coding_test1.Models.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class UserServiceImpl implements UserService {
    @Value("${userDirectory.path}")
    private String userDirectoryPath;
    private final String IN_DIR = "IN/";
    private final String OUTPUT_FILE = "user.json";

    @Override
    public boolean storeUsers(List<User> users) {
        prepareDirectory();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(String.join("", this.userDirectoryPath, this.IN_DIR, this.OUTPUT_FILE)),
                    users);
        } catch (IOException e) {
            System.err.println("Failed to write a JSON file!" + e.getMessage());
            return false;
        }
        return true;

    }

    public void prepareDirectory() {
        try {
            Path userPath = Paths.get(this.userDirectoryPath);
            if (!Files.exists(userPath)) {
                Files.createDirectories(userPath);
            }
            Path inPath = Paths.get(this.userDirectoryPath + this.IN_DIR);
            Files.createDirectories(inPath);
        } catch (IOException e) {
            System.err.println("Failed to create directory!" + e.getMessage());
        }
    }
}
