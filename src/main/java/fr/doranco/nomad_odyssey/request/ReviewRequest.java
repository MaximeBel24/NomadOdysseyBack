package fr.doranco.nomad_odyssey.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewRequest {

    private Long productId;
    private String review;
}
