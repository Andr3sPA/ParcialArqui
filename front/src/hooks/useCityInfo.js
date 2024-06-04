import { useEffect, useState } from "react";

export const useCityInfo = () => {
  const [cityInfo, setCityInfo] = useState();

  useEffect(() => {
    const apiUrl = `https://9mtl64dl-8080.use2.devtunnels.ms/cities`;

    const fetchData = async () => {
      await fetch(apiUrl)
        .then((response) => response.json())
        .then((data) => {
          setCityInfo(data);
        });
    };

    fetchData();
  }, []);
  return cityInfo;
};
