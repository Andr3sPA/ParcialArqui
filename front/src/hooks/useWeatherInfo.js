import { useEffect, useState } from "react";

export const useWeatherInfo = (city, country) => {
  const [weatherInfo, setWeatherInfo] = useState();

  useEffect(() => {
    const apiUrl = `https://9mtl64dl-8080.use2.devtunnels.ms/api/v1/weather?city=${city}&country=${country}`;

    const fetchData = async () => {
      await fetch(apiUrl)
        .then((response) => response.json())
        .then((data) => setWeatherInfo(data));
    };
    fetchData();
  }, [city, country]);
  return weatherInfo;
};
