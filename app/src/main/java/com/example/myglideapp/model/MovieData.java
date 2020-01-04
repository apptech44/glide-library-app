package com.example.myglideapp.model;

import java.util.ArrayList;
import java.util.List;

public class MovieData {

    private static List<Movies> moviesList;

    public static List<Movies> setMovieData() {

        moviesList = new ArrayList<>();

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/the_elder_scrolls_online_sword_of_the_night_warrior_assassin_95957_1280x720.jpg"
                , "The Elder"));

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/dark_souls_dark_souls_ii_art_game_98201_1280x720.jpg"
                , "Dark Souls"));

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/world_of_tanks_t_62a_field_105518_1280x720.jpg"
                , "World of Tanks"));

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/the_witcher_3_wild_hunt_the_witcher_cd_projekt_99850_1280x720.jpg"
                , "The Witcher 3"));

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/call_of_duty_black_ops_black_ops_iii_102453_1280x720.jpg"
                , "black ops iii"));

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/the_witcher_3_wild_hunt_hearts_of_stone_105826_1280x720.jpg"
                , "the witcher 3"));

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/dragon_age_inquisition_dragon_age_pc_xbox_360_xbox_one_playstation_3_playstation_4_bioware_93158_1280x720.jpg"
                , "dragon age inquisition"));

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/call_of_duty_infinite_warfare_infinity_ward_110729_1280x720.jpg"
                , "infinite warfare"));

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/counter_strike_global_offensive_cs_counter_strike_global_offensive_ss_go_97304_1280x720.jpg"
                , "counter strike global"));

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/battlefield_4_game_ea_digital_illusions_ce_93159_1280x720.jpg"
                , "battlefield 4"));

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/call_of_duty_ghosts_game_activision_infinity_ward_soldiers_mask_face_96174_1280x720.jpg"
                , "call of duty ghosts"));

        moviesList.add(new Movies("https://images.wallpaperscraft.com/image/hitman_vi_game_2014_premiere_92922_1280x720.jpg"
                , "Hit Man v"));

        return moviesList;
    }

}
