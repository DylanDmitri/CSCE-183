//
//  main.c
//  Assignment1
//
//  Created by Dylan Gray on 8/24/15.
//  Copyright (c) 2015 Dylan Gray. All rights reserved.
//

#include <stdio.h>

int main(void) {
    int cost;
    printf("Cost of investment? ");
    scanf("%d", &cost);
    
    int gain;
    printf("Gain from investment? ");
    scanf("%d", &gain);
    
    float roi = (float)(gain-cost) / cost;
    
    printf("\nCost of Investment: $%d", cost);
    printf("\nGain of Investment: $%d", gain);
    printf("\nReturn on Investment: %.2f%%", roi);
}


