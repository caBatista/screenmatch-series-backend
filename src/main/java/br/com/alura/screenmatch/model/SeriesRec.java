package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SeriesRec(@JsonProperty("Title") String title,
                        @JsonProperty("totalSeasons") Integer totalSeasons,
                        @JsonProperty("imdbRating") String rating,
                        @JsonProperty("Type") String type)
{}
