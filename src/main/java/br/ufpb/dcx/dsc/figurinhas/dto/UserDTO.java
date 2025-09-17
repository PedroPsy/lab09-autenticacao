package br.ufpb.dcx.dsc.figurinhas.dto;

import br.ufpb.dcx.dsc.figurinhas.models.Photo;
import br.ufpb.dcx.dsc.figurinhas.models.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDTO {

    private Long id;
    @NotBlank
    private String username;
    @Email
    private String email;

    private Photo photo;

    public UserDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", nome='" + username + '\'' +
                ", email='" + email + '\'' +
                ", photo=" + photo +
                '}';
    }
}