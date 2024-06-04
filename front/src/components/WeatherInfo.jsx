import { Card } from "./Card";
import { useCityInfo } from "../hooks/useCityInfo";

export const WeatherInfo = () => {
  const cityInfo = useCityInfo();
  return (
    <div className="flex-container">
      {cityInfo?._embedded?.cities?.map((city) => (
        <Card key={city.id} city={city} />
      ))}
    </div>
  );
};

export default WeatherInfo;
