#include <stdio.h>
#include <math.h>

double torads(double d) {
	while (d > 180) {
		d -= 360;
	}
	while (d < -180) {
		d += 360;
	}

	return d * M_PI / 180.0;
}

double fromrads(double r) {
	while (r > M_PI) {
		r -= M_PI;
	}
	while (r < -M_PI) {
		r += M_PI;
	}

	return r * 180 / M_PI;
}

int main() {

	double lat1, lat2, lon1, lon2;

	printf("Enter the Latitude and Longitude\n");
	scanf("%lf %lf %lf %lf", &lat1, &lon1, &lat2, &lon2);

	//printf("%lf %lf %lf %lf \n", lat1, lat2, lon1, lon2);

	double lat1Rad = torads(lat1);
	double lat2Rad = torads(lat2);

	double delta = torads(lon2 - lon1);

	double bearing = fromrads(atan2(sin(delta) * cos(lat2),
					cos(lat1Rad) * sin(lat2) - sin(lat1Rad) * cos(lat2Rad) * cos(lat2Rad)));

	printf("From (%lf, %lf) to (%lf, %lf) the bearing is %lf.\n", lat1, lat2, lon1, lon2, bearing);

	return 0;

}

//40.8206 -96.7056 41.9483 -87.6556
