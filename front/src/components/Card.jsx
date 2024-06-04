import { useState } from "react";
import "../styles/components/Card.css";
import { useWeatherInfo } from "../hooks/useWeatherInfo";

export const Card = ({ city }) => {
  const weatherInfo = useWeatherInfo(city.name, city.country);

  return (
    <div className="container-card">
      <section className="left">
        <b>Ciudad: {city?.name}</b>
        <p>País: {city?.country}</p>
      </section>
      <hr />
      <section className="right">
        <b>Clima</b>
        <p>Temperatura(°C): {weatherInfo?.temperature}</p>
        <p>% Humedad: {weatherInfo?.humidity}</p>
        <p>% Precipitacion: {weatherInfo?.precipitation}</p>
      </section>
    </div>
  );
};
