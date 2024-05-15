package com.neobis.cookscorner.dtos.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.neobis.cookscorner.dtos.RecipeResponseDto;
import com.neobis.cookscorner.entities.Recipe;
import com.neobis.cookscorner.entities.User;
import com.neobis.cookscorner.entities.UserLikes;
import com.neobis.cookscorner.entities.UserSaves;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
    private String photo;
    private List<RecipeResponseDto> recipes;
    private Integer likesCount;
    private List<RecipeResponseDto> saves;
    private Integer followersCount;
    private Integer followingsCount;
}
