#include <stdio.h>
#include <math.h>

double torads(double t)
{
	while(t > 180){
        t -= 360;
    }

    while(t < -180){
        t += 360;
    }

    return t*M_PI/180.0;
}



double fromrads(double t)
{
    while(t > M_PI){
        t -= M_PI;
    }
    while(t < -M_PI){
        t += M_PI;
    }

    return t*180/M_PI;
}

int main()
{

    double lat1, lat2, lon1, lon2;
    scanf("%lf %lf %lf %lf", &lat1, &lat2, &lon1, &lon2);
    printf("%lf\n\n", M_PI/180.0);
    lat1 = torads(lat1);
    lat2 = torads(lat2);

    double delta =  torads(fabs(lon2-lon1));

    printf("%lf %lf %lf   ", lat1, lat2, delta);

    double bearing = fromrads(atan2(sin(delta)*cos(lat2), cos(lat1)*sin(lat2)-sin(lat1)*cos(lat2)*cos(delta)));

    printf("%lf\n", bearing);

    return 0;

}

