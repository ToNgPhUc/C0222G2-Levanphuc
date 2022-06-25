package com.phuc.validate_music.model;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class MusicDto implements Validator {

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 800 ,message = "no more than 800 characters")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "không được chứa các kí tự đặc biệt")
    private String nameMusic;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 300 ,message = "no more than 300 characters")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "không được chứa các kí tự đặc biệt ")
    private String singer;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 1000 ,message = "no more than 1000 characters")
    @Pattern(regexp = "^[a-zA-Z0-9,]*$", message = "không được chứa các kí tự đặc biệt ngoại trừ dấu phẩy ")
    private String kindOfMusic;

    public MusicDto() {
    }

    public MusicDto(@NotNull @NotEmpty @NotBlank @Size(max = 800, message = "no more than 800 characters") @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "không được chứa các kí tự đặc biệt") String nameMusic, @NotNull @NotEmpty @NotBlank @Size(max = 300, message = "no more than 300 characters") @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "không được chứa các kí tự đặc biệt ") String singer, @NotNull @NotEmpty @NotBlank @Size(max = 1000, message = "no more than 1000 characters") @Pattern(regexp = "^[a-zA-Z0-9,]*$", message = "không được chứa các kí tự đặc biệt ngoại trừ dấu phẩy ") String kindOfMusic) {
        this.nameMusic = nameMusic;
        this.singer = singer;
        this.kindOfMusic = kindOfMusic;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
